import com.mongodb.client.MongoCollection;
import org.bson.Document;

try {
    MongoCollection<Document> collection = vars.getObject("collection");

    // Creating a new document to insert
    Document newDocument = new Document()
            .append("fname", "newUser")
            .append("lname", "newLastName")
            .append("role", "Student")
            .append("course", "Cloud");

    // Inserting the new document into the collection
    collection.insertOne(newDocument);

    // Retrieving the _id of the inserted document
    String newDocumentId = newDocument.getObjectId("_id").toString();

    vars.put("newDocumentId", newDocumentId);

    return "Document with id=" + newDocumentId + " inserted successfully";
} catch (Exception e) {
    SampleResult.setSuccessful(false);
    SampleResult.setResponseCode("500");
    SampleResult.setResponseMessage("Exception: " + e);
    return "Failed to insert document. Exception: " + e;
}
