@interface Base {}

@interface MyAnnoNew {
    String str();
}


/**
//Restrictions
1
@interface MyAnnoNew  extends Base { // ERROR : extend keyword cannot be used
    String str();
}
2
@interface MyAnnoNew {
    String str(String s ); //metghod cannot contain parameter
}
3
@interface MyAnnoNew {
    void str(); // return type cannot be void
}
4
@interface MyAnnoNew {
    String str() throws Exception ; // cannot used throws clause
}

5
@interface MyAnnoNew<P> {//cannot used generics in annotation
    String str();
}

**/


public class Restriction {
}
