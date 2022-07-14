package ec.edu.espe.arquitectura.server.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApplicationValues {
  private final String mongoHost;
  private final String mongoDB;
  private final String mongoUsr;
  private final String mongoPwd;
  private final String mongoAut;

  public ApplicationValues(
      @Value("${espe.server.mongo.host}") String mongoHost,
      @Value("${espe.server.mongo.db}") String mongoDB,
      @Value("${espe.server.mongo.usr}") String mongoUsr,
      @Value("${espe.server.mongo.pwd}") String mongoPwd,
      @Value("${espe.server.mongo.aut}") String mongoAut) {

    this.mongoHost = mongoHost;
    this.mongoDB = mongoDB;
    this.mongoUsr = mongoUsr;
    this.mongoPwd = mongoPwd;
    this.mongoAut = mongoAut;
  }
}
