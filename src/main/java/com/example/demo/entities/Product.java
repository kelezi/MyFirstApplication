package com.example.demo.entities;

import com.example.demo.dto.ProductDetailsDTO;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(schema = "Production", name ="product")
@SqlResultSetMapping(
        name = "getProductDetailsMapping",
        classes = {
                @ConstructorResult(
                        targetClass = ProductDetailsDTO.class,
                        columns = {
                                @ColumnResult(name = "name", type = String.class),
                                @ColumnResult(name = "price", type = BigDecimal.class),
                                @ColumnResult(name = "category", type = String.class)
                        }
                )
        }
)
@NamedNativeQuery(
        name = "Product.getProductDetails",
        query = "Select p.name, p.listprice as price, pc.name as category " +
                "   from Production.product p join Production.productcategory pc " +
                "       on pc.productcategoryid = p.productsubcategoryid where p.productid= :id",
        resultSetMapping = "getProductDetailsMapping"
)
public class Product {

    @Id
    private Integer productid;
    @Column
    private String name;
    @Column
    private String productnumber;
    @Column
    @Nullable
    private String color;

}
