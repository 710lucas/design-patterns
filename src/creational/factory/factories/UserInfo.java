package creational.factory.factories;

import creational.factory.documents.Document;

public abstract class UserInfo {

    public String getUserInfo(){
        return getUserDocument().getData();
    }

    public abstract Document getUserDocument();


}
