# Bike Shop Service Tracker

AP Computer Science A — Java Classes Project (Units 1–3)

## Scenario

Build a console-based program for a bicycle repair shop. The shop tracks bicycles, service records, repair charges, and the number of completed repairs.

You will write all Java code yourself. The four `.java` files in this repository are intentionally **completely empty**. You are responsible for defining classes, fields, constructors, methods, and a client program.

## Files

- `Main.java` — client program with `public static void main(String[] args)`
- `Bicycle.java` — bicycle data and behavior
- `ServiceRecord.java` — information about service performed on a bicycle
- `BikeShop.java` — shop-wide operations and statistics

## Requirements

### `ServiceRecord`

Each `Bicycle` has one `ServiceRecord`.

A `ServiceRecord` has:
- A service description (`String`), accumulated cost (`double`), and completion status (`boolean`).
- A constructor to initialize a new record.
- Accessor methods (getters).
- An `addCharge(double amount)` method to add only valid positive charges.
- A **private helper method** to validate a charge.
- A method to mark a record complete.
- A `toString()` method describing the state of a record.

### `Bicycle`

A `Bicycle` has:

- An owner (`String`), model (`String`), mileage (`int`), and an associated `ServiceRecord`.
- A unique ID using a **private static** next-ID counter and a **private final** instance ID.
- A constructor that sets the owner and model, initializes mileage to zero, assigns the next ID, and creates a `ServiceRecord`.
- A `ride(int miles)` method to increase mileage only when the argument is positive.
- A `needsService()` method using a clearly documented mileage rule of your choice.
- Appropriate accessors, including `getServiceRecord()`.

### `BikeShop`

- Declare `public static final double LABOR_RATE = 65.0`.
- Maintain a counter of completed repairs.
- Implement `static serviceBike(Bicycle bike, double hours)`. For valid positive hours, calculate the labor charge, add it to the bicycle's existing service record, mark that record complete, and increment the completed-repairs counter. Invalid input must not count as a repair.
- Implement `static getTotalRepairs()`.
- Use a **private static helper method** to calculate labor cost.

### `Main` — demonstrate and test

- Create at least two distinct bicycles.
- Display their initial state.
- Call `ride()` with valid and invalid mileage values and verify the results.
- Service both bicycles with different labor-hour values.
- Print the service costs and the shop's completed-repairs count.
- Demonstrate object aliasing: assign a second variable to an existing `Bicycle`, change the bicycle through one variable, and show the change through the other.
- Demonstrate that passing a `Bicycle` into `serviceBike()` changes the original object's service record.
- Exercise conditionals, arithmetic expressions, boolean logic, and appropriate `String` operations.

Sample output:

```text
INITIAL BICYCLES
Bike #1: Sam's Trek Domane, 0 miles; Routine bicycle service: $0.00 (open)
Bike #2: Alex's Giant Escape, 0 miles; Routine bicycle service: $0.00 (open)

AFTER RIDES
BikeA mileage after riding 475 miles: 475
BikeB needs service (after riding 600 miles, expect true): true
BikeA needs service (expect false): false

ALIASING
BikeA mileage after alias rides 50 miles (expect 525): 525

AFTER SERVICE
Bike #1: Sam's Trek Domane, 525 miles; Routine bicycle service: $97.50 (complete)
Bike #2: Alex's Giant Escape, 600 miles; Routine bicycle service: $130.00 (complete)
BikeA charge (expected 97.50): 97.5
BikeB charge (expected 130.00): 130.0
Completed repairs (expected 2): 2
```

## Bonus: interactive console using `Scanner`

After your required tests work, create a new client called `Main-Input.java` and let a user interact with the shop. For example:

1. Ask for a bicycle owner and model.
2. Ask how many miles the bicycle has been ridden.
3. Ask how many hours of service work to perform.
4. Calculate and display the charge and updated service record.
5. Optionally ask whether to service another bicycle.

Use `java.util.Scanner`. Validate numeric inputs and handle the newline after numeric reads if mixing `nextInt()`/`nextDouble()` with `nextLine()`.

**The bonus is optional.** The required program can use hard-coded demonstration data; no user input is necessary.

## Rubric

### ServiceRecord

| Requirement |
|---|
| Private fields for description, cost, and completion status |
| Constructor initializes a `ServiceRecord` |
| Accessors provide record information |
| Valid charges added; invalid charges rejected |
| Private validation helper |
| Completion method and readable `toString()` |

## Bicycle

| Requirement |
|---|
| Private fields for owner, model, mileage, and `ServiceRecord` |
| Unique ID using static counter and final instance field |
| Constructor initializes bicycle and service record |
| `ride()` updates mileage for valid (positive) input only |
| `needsService()` uses a documented rule |
| Appropriate accessors, including service record |

## BikeShop

| Requirement |
|---|
| Static final labor-rate constant |
| Private static completed-repairs counter |
| `serviceBike()` calculates and records valid service |
| Invalid hours do not count as a repair |
| Repair count accessor and private cost helper |
| Updates existing bicycle and service record |

## Main / Testing

| Requirement |
|---|
| Creates and displays at least two bicycles |
| Tests valid and invalid mileage |
| Services bikes and displays costs and repair count |
| Demonstrates object aliasing |
| Demonstrates mutation through object parameter |
| Uses conditionals, arithmetic, boolean logic, and Strings |

## Code / Submission

| Requirement |
|---|
| Program compiles and runs |
| Code is organized, readable, and appropriately encapsulated |
| Work committed and pushed to GitHub |

## Optional Bonus

| Requirement |
|---|
| `Scanner` interaction with reasonable input handling |

## Working in VS Code and GitHub

1. Open this folder in VS Code with the Java Extension Pack installed.
2. Create a GitHub repository from this starter project (or use a teacher-provided repository).
3. Implement one class at a time and commit after each meaningful milestone.
4. Run `Main.java` in VS Code, or use the terminal:

   ```bash
   javac Main.java Bicycle.java ServiceRecord.java BikeShop.java
   java Main
   ```

5. Push your final changes to GitHub.