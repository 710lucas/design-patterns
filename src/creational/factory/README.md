# Factory pattern

The factory pattern is used to handle the creation of multiple subclasses.

It makes the code more flexible, since you don't need to worry about directly creating the new instances of the classes.

## Example : Creating different types of documents

In this example, we're creating two different types of documents, the CPF and the CNPJ.

Both CNPJ and CPF are implementations of the Document interface.

We create a UserInfo abstract class, to obtain the user's info based on the CPF and CNPJ, the abstract method is the one that provides the user's Document.

After that, we have the factories for CNPJ and CPF, which handle the creating of new instances of those documents.

So, when we call the `UserInfo.getUserInfo`, we're retrieving the data created by one of the two factories.

If we wanted, we could add a new Document and just create a new factory, without needing to worry how we would create each document every time.

### Challenge:
Implement some kind of validation when obtaining the CPF and CNPJ data.
