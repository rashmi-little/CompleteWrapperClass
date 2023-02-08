## Byte class
### Properties
- MIN_VALUE -> pulic static fianl 
- MAX_VALUE -> public static final 
- TYPES -> whose wrapper class is it 
- SIZE  -> return size in bits(8 bits)
- BYTES -> return size in bytes
---
### Constructers
- Byte class has the two overloaded constructer one takes byte as the argument and another takes String as the argument.
- Else throws number format exception
- First one is of byte type , called when object is created with byte argument.
- Byte b = new Byte((byte)120);
- This consructer called when we create an object with argument of String type.
- Byte b = new Byte("120") 
### Methods
- toString(byte) -> public static -> return java.lang.string this is use when we have the byte value store in primitive data type.
` byte b = 40;`
- `String s = Byte.toString(b) `
- toString() -> non static method -> return java.lang.String.This is use when we have value store in Byte reference.
- ` Byte b = 40;`
- `String s = b.toString()`

#### valueOf() ->static
- THis is a over loaded method which is used for memory utilisation process.
- Three overloaded valueOf() are 
    - valueOf(byte);
    - valueOf(String);
    - valueOf("String",radix(int)); throws (Number format exception)
#### decode(String) 

- *Only for binary decima and hexadecimal means radix should be greater than 8* 
- This is a satic method which takes java.lang.String and convert into byte.But according to above constraints we can also provide the + sign and - sign also.
#### parseByte() ->static
- This is also a overloaded method which takes string as argument and return corresponding byte value.
- We can also provide String with radix to the parseByte method.
## Notes
- As the byte class is extend from Number class which is a abstract class so we must have to define all the properties of the Number class in the all child classes so as Byte.
----
### Non-static method of Byte class
- let Byte b = new Byte("10");
- b.byteValue() -> 10
- b.shortValue() -> 10
- b.intValue() -> 10
- b.floatValue() -> 10.0
- b.longValue() -> 10
- b.doubleValue() -> 10.0

#### Pairof method (hashcode and equals)
#### hashCode()
- hashCode() is also of both static and non-static type.
- If we have the value store in the primitive type then we can call hashCode() statically and the primitive variable as the data type.
- Else the value is store in the form of class reference we can call the non static method through this object.
- This method returns reference address in the form of int.
#### equals(java.lang.object)
- equals() is the non static method call through a obejct and check with the object present in its parameter.
- its return type is boolean.
- where ` == ` Checks address in case of reference comparesion `equals()` checks for the contain.
---
### compareTo(java.lang.object) -> non-static
- This is a genaral non static method which compare the difference  between two object and return result in the form of int.
---
### These are of static type.
### compare(byte,byte) 
- This is a static method which takes two byte value and compare and return the diffence between them as int.
### compareUnsigned(byte,byte)
- This method takes two unsigned byte  and give the difference between them in int.
### toUnsigendInt(byte)
- This method takes byte in argument and returns int type.
### toUnsigendLong(byte)
- This method takes byte as an input and return long type.