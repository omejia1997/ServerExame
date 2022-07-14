package ec.edu.espe.arquitectura.server.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

//@CompoundIndex(name = "idxco_customer_docTypeDocId", def = "{'docummentType': 1, 'docummentId': 1}")

@Data
@Builder
@Document(collection = "products")
@TypeAlias("products")
public class Product{
    @Id 
    private String id;
    //@Indexed(name = "idxu_customer_internalId", unique = true)
    private String name;
    private Float price;
    private Integer existence;
    private Date manufacturDate; 
}


