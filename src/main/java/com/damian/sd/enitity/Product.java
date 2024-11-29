package com.damian.sd.enitity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import org.springframework.data.annotation.Id;


@DynamoDBTable(tableName = "Products")
@Data
public class Product {

    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    private String name;
    private Double price;

}
