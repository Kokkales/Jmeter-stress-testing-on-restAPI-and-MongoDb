import com.mongodb.client.MongoCollection;
import org.bson.Document;

try {
    MongoCollection<Document> collection = vars.getObject("collection");

    // Define the filter to match documents with fname equal to "John"
    Document filter = new Document("fname", "newUser");

    // Delete the first document that matches the filter
    collection.deleteOne(filter);

    return "Document with fname=John deleted successfully";
} catch (Exception e) {
    SampleResult.setSuccessful(false);
    SampleResult.setResponseCode("500");
    SampleResult.setResponseMessage("Exception: " + e);
    return "Failed to delete document. Exception: " + e;
}
