package spun.llewellyn.talks.legacycode.examples;

import org.easymock.EasyMock;
import org.easymock.IExpectationSetters;
import org.lambda.actions.Action0;
import org.lambda.functions.Function0;

public class MockUtils
{

  public static IExpectationSetters<Object> expect(Action0 action)
  {
    action.call();
    return EasyMock.expectLastCall();
 }

  public static void finalizeExpectations(Object... mocks)
  {
    EasyMock.replay(mocks);
  }

  public static <T> T createStrictMock(Class<T> class1)
  {
    return EasyMock.createStrictMock(class1);
  }

  public static <T> IExpectationSetters<T> expect(Function0<T> o)
  {
    return EasyMock.expect(o.call());
  }

 
  
}
