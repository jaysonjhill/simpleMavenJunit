package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

  private Greeter greeter = new Greeter();

  @Test
  //SuccessTest
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }
  @Test
  public void greeterSaysHello1() {
    assertThat(greeter.sayHello(), containsString("World"));
  }
  @Test
  public void greeterSaysHello2() {
    assertThat(greeter.sayHello(), containsString("Bye"));
  }
  
  //FailedTest
  @Test
  public void greeterSaysHello3() {
    assertThat(greeter.sayHello(), containsString("Fail"));
  }
  @Test
  public void greeterSaysHello4() {
    assertThat(greeter.sayHello(), containsString("Fail"));
  }
  
}
