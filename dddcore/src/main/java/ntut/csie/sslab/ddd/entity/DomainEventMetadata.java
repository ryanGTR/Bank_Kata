package ntut.csie.sslab.ddd.entity;

import java.util.HashMap;
import java.util.Map;
import ntut.csie.sslab.ddd.entity.common.Json;

public class DomainEventMetadata {
  private final Map<String, Object> metadata;

  public DomainEventMetadata() {
    this.metadata = new HashMap<>();
  }

  public void append(String key, Object value) {
    metadata.put(key, value);
  }

  public String asJsonString() {
    return Json.asString(metadata);
  }
}
