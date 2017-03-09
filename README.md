JDBC HW1
========

1 DB Installation
-----------------

1. Download and install H2 database
2. Create database `store`
3. Create user `store_user` with any password
4. Include gradle dependency for H2 JDBC driver

2 Store Schema
--------------

Design database model that represents store. 
There should be following tables:
1. **category**: id, title, description
2. **property**: name, value. Please be sure that there is no way to create 2 properties with the same name and value.
3. **item**: id, title, description, price
4. **catalog**: id, name
 
3 Store Relations 
-----------------

Create relations between tables.

1. One item should contain many properties. Many items may contain the same properties.
2. One item should be related to many categories. Many items may be related to many categories.
3. One item may be related to many catalogs. One catalog may contains many items.

4 Demo class 
------------

Create demo class, that creates:

1. Several items.
2. Several categories.
3. Several catalogs.
4. Several properties.
5. Link items to catalogs, categories, properties.
6. Retrieve information about all catalogs, with all items in this catalog. Note that properties and categories of all items should be filled in.

**NOTE**: All SQL statements for user, schema creation should be in the `resource` folder as SQL file. Also feel free to extend or modify models with any additional methods and fields if needed.
