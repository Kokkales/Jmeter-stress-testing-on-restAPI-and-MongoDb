import com.mongodb.*

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import java.util.Arrays;

try {
	MongoClientSettings settings = MongoClientSettings.builder()
		.applyToClusterSettings {builder ->
			builder.hosts(Arrays.asList(new ServerAddress(vars.get("mongoHost"),vars.get("mongoPort").toInteger())))}
		.build();

	MongoClient mongoClient = MongoClients.create(settings);

	MongoDatabase database = mongoClient.getDatabase(vars.get("databaseName"));
	MongoCollection<Document> collection = database.getCollection(vars.get("collectionName"));

	vars.putObject("collection", collection);

	return "Connected to " + vars.get("collectionName");
}
catch (Exception e) {
	SampleResult.setSuccessful(false);
	SampleResult.setResponseCode("500");
	SampleResult.setResponseMessage("Exception: " + e);
}