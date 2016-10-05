package be.nabu.libs.types.definition.api;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

import be.nabu.libs.types.api.ComplexType;

public interface DefinitionUnmarshaller {
	public ComplexType unmarshal(InputStream input) throws IOException, ParseException;
}
