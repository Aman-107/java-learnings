package Super_keyword;

public class super_parent {

	String name = "Aman Daddy";
	
	public void getData() {
		System.out.println("This is parent class method function value");
	}
	
	public super_parent() {
		System.out.println("Parent class constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/* 

The `super` keyword in Java refers to the **immediate parent class object**. It is mainly used in inheritance.

### 1. Access a parent class variable

When a child class has a variable with the same name as the parent class variable:

```java
class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(name);       // Dog
        System.out.println(super.name); // Animal
    }
}
```

---

### 2. Call a parent class method

When a child class overrides a method:

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        sound();       // Dog barks
        super.sound(); // Animal sound
    }
}
```

---

### 3. Call a parent class constructor

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls Animal constructor
        System.out.println("Dog constructor");
    }
}
```

Output:

```text
Animal constructor
Dog constructor
```

If you don't write `super()`, Java automatically inserts it as the first statement in the constructor (provided the parent has a no-argument constructor).

---

### 4. Call a parameterized parent constructor

```java
class Animal {
    Animal(String name) {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    Dog() {
        super("Tommy");
    }
}
```

Output:

```text
Animal: Tommy
```

---

### Rules

* `super()` must be the **first statement** inside a constructor.
* `super` can only refer to the **immediate parent class**.
* You cannot use `this()` and `super()` together in the same constructor because both must be first.

### Quick comparison

| Keyword | Refers to                     |
| ------- | ----------------------------- |
| `this`  | Current class object          |
| `super` | Immediate parent class object |

```java
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println(this.x);  // 20
        System.out.println(super.x); // 10
    }
}
```

Use `super` whenever you need to access or invoke something from the parent class that has been hidden or overridden in the child class.



*/
