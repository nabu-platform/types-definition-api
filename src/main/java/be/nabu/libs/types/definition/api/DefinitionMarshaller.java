package be.nabu.libs.types.definition.api;

import java.io.IOException;
import java.io.OutputStream;

import be.nabu.libs.property.api.Value;
import be.nabu.libs.types.api.ComplexType;

public interface DefinitionMarshaller {
	public void marshal(OutputStream output, ComplexType type, Value<?>...values) throws IOException;
}
