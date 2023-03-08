# Peel

This is for a method where the blocking part is at the outside
(top or bottom) of the method

1. [ ] Call the Method 
      Example: `Method(param1)`
2. [ ] Select everything that isn't the problem
3. [ ] Extract into public method called `Method2`
4. [ ] Call  `Method2` instead
      Example:`Method2(newParams)`

# Slice

This is for method where the blocking part is in the middle of the method

1. [ ] Call the Method passing null for all params
   Example: `Method(param1)`
2. [ ] See the failing error:  
       Example: Error when calling `object.Method(param1,param2);`
3. [ ] Pass in a mock for the `object` where the call is failing
4. [ ] See the new failing error:  
       Example: Unexpected call to `object.Method(param1,param2);`
5. [ ] add Mock behavior for that call
6. [ ] repeat 

## Mock Example

<!-- snippet: mock_example -->
<a id='snippet-mock_example'></a>
```java
var listMock = createStrictMock(List.class);
expect(() -> listMock.size()).andReturn(6).times(1);
finalizeExpectations(listMock);
Assertions.assertEquals(6, listMock.size());
```
<sup><a href='/src/test/java/spun/llewellyn/talks/legacycode/docs/ExampleTests.java#L13-L18' title='Snippet source file'>snippet source</a> | <a href='#snippet-mock_example' title='Start of snippet'>anchor</a></sup>
<!-- endSnippet -->

This also works for methods that return void

<!-- snippet: mock_void_example -->
<a id='snippet-mock_void_example'></a>
```java
var listMock = createStrictMock(List.class);
expect(() -> listMock.clear());
finalizeExpectations(listMock);
listMock.clear();
//listMock.clear(); this would throw an exception
```
<sup><a href='/src/test/java/spun/llewellyn/talks/legacycode/docs/ExampleTests.java#L22-L28' title='Snippet source file'>snippet source</a> | <a href='#snippet-mock_void_example' title='Start of snippet'>anchor</a></sup>
<!-- endSnippet -->

# Peel & Slice

1. [ ] Call Method
2. [ ] See Problem
3. [ ] Solve Problem
   1. If at **Top** or **Bottom**
      1. [ ] Peel
   2. If in **Middle** 
      1. [ ] Slice
4. [ ] Repeat until done
