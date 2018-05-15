# Design Pattern DEMO with Java

## Behavioral

### [Chain Of Responsibility](src/org/lwstudio/designpatternjava/behavioral_chain_of_responsibility/ChainOfResponsilibityDemo.java)

- Decouple sender and receiver from request
- Runtime configuration
- Hierarchical in nature
- Be careful with long chain

### [Command](src/org/lwstudio/designpatternjava/behavioral_command/CommandDemo.java)

- Encapsulate each request as an object
- Decouple sender from processor
- Few drawbacks
- Often used for undo functionality

### [Interpreter 解譯器](src/org/lwstudio/designpatternjava/behavioral_interpreter/InterpreterDemo.java)

#### Design

- Context 待解譯的語句
- AbstractExpression 所有規則都要實作的介面
- Interpret(Context) with
    - TerminalExpression 最小單位的規則
    - NonterminalExpression 可以再展開的規則組合

#### Example in Java

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {
    
    public static void main(String[] args) {
        String input = "Apple, orange, and lemons!";
        
        Pattern p = Pattern.compile("(orange|Orange|lemon|Lemon|apple|Apple|grape|Grape)");
        Matcher m = p.matcher(input);
        
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
    
}
```

### [Iterator](src/org/lwstudio/designpatternjava/behavioral_iterator/IteratorDemo.java)

#### Design

- Interface based
- Factory Method based
- Independent, but fail fast
- Enumerators are fail safe
- Iterator, ConcreteIterator

#### Example in Java

```java
import java.util.ArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Vincent");
        names.add("Ravi");
        names.add("Joan");

        Iterator<String> namesIterator = names.iterator();

        while(namesIterator.hasNext()) { 
            String name = namesIterator.next();
            System.out.println(name);
            namesIterator.remove();
        }
    }
}
```
