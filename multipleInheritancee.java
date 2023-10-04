interface Backend {

  // abstract class
  public void connectServer();
}

class Frontend {

  public void responsive(String str) {
    System.out.println(str + " can also be used as frontend.");
  }
}

// Language extends Frontend class
// Language implements Backend interface
class multipleInheritancee extends Frontend implements Backend {

  String language = "Java";

  // implement method of interface
  public void connectServer() {
    System.out.println(language + " can be used as backend language.");
  }

  public static void main(String[] args) {

    // create object of Language class
     multipleInheritancee java = new multipleInheritancee();

    java.connectServer();

    // call the inherited method of Frontend class
    java.responsive(java.language);
  }

}