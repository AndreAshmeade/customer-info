@Entity : Marks the class as an entity 
 - The entity name defaults to the name of the class. We can change its name using the name element.

@Entity(name="customer")
public class customer{
  //fields, getters and setters
}

@Table: annotation specifies the table in the database with which this entity is mapped.

@Entity
@Table(name = "customer")
public class customer{
  //fields, getters and setters
}

If we do not use the @Table annotation, the name of the entity will be considered the name of the table.


- Schema name helps to distinguish one set of tables from another 

@Entity
@Table(name = "customer", schema="store")
public class customer{
  //fields, getters and setters
}


@Id: annotation specifies the primary key of the entity

@Entity
@Table(name = "customer")
public class Customer {
  @Id
  private int id;
}


Each JPA entity must have a primary key that uniquely identifies it. The @Id annotation defines the primary key. 


@GeneratedValue : specifies the generation strategies for the values of primary keys:


@Entity
@Table(name = "Customer")
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private int id;
}

We can generate the identifiers in different ways which are specified by the @GeneratedValue annotation.

We can choose from four id generation strategies with the strategy element. The value can be AUTO, TABLE, SEQUENCE, or IDENTITY.


@Column: Specifies the mapped column for a persistent property or field.

If no Column annotation is specified, then the filed names will be used for mapping.

@Entity
public class Customer {
    @Id
    @Column(name = "customer_id",length=50, unique=false)
    private String id;
    @Column(name = "customer_name",
    length=50, unique=false)
    private String name;
    @Column(name = "customer_age",
    length=50, unique=false)
    private int age;
}

- The name element specifies the name of the column in the table. 
- The length element specifies its length. 
- The nullable element specifies whether the column is nullable or not, and the unique element specifies whether the column is unique.


@sequenceName is the name of the sequence in the DB. This is how you specify a sequence that already exists in the DB. If you go this route, you have to specify the allocationSize which needs to be the same value that the DB sequence uses as its "auto increment".


Overriding the toString method allows for meaningful output to be returned. 

