import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjetland.jackson.jsonSchema.JsonSchemaGenerator;

import model.entities.Business;
import model.entities.EntityWrapper;
import model.entities.Person;

public class SchemaGenerator {
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonSchemaGenerator jsonSchemaGenerator = new JsonSchemaGenerator(objectMapper);

		//this works
		JsonNode businessSchema = jsonSchemaGenerator.generateJsonSchema(Business.class);
		String businessSchemaAsString = objectMapper.writeValueAsString(businessSchema);
		System.out.println(businessSchemaAsString);
		
		//and this
		JsonNode personSchema = jsonSchemaGenerator.generateJsonSchema(Person.class);
		String personSchemaAsString = objectMapper.writeValueAsString(personSchema);
		System.out.println(personSchemaAsString);
		
		//but not this
		JsonNode entityWrapperSchema = jsonSchemaGenerator.generateJsonSchema(EntityWrapper.class);
		String entityWrapperSchemaAsString = objectMapper.writeValueAsString(entityWrapperSchema);
		System.out.println(entityWrapperSchemaAsString);
	}

}
