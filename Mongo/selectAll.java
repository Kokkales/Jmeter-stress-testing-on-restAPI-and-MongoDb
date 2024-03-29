import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;

import org.bson.Document;
import org.bson.types.ObjectId;

try {
	MongoCollection<Document> collection = vars.getObject("collection");

	Document result = collection.find().first();

	vars.put("exampleDocumentId", result.get("_id").toString());

	return "Document with id=" + result.get("_id") + " found";
}
catch (Exception e) {
	SampleResult.setSuccessful(false);
	SampleResult.setResponseCode("500");
	SampleResult.setResponseMessage("Exception: " + e);
}