
A basic system that simulates a courier service, demonstrating SOLID principles. The system includes functionality for ordering products, processing payments, managing deliveries, and submitting reviews.

**Technologies Used**
Java

**Project Structure**

Product: Represents the product being ordered.
Order: Manages product orders.
Payment: Interface for processing payments.
CreditCardPayment & PaypalPayment: Implementations of payment methods.
Delivery: Manages the delivery process.
ExpressDelivery & StandardDelivery: Different delivery methods.
Review: Interface for submitting reviews.
ProductReview: Implementation for reviewing products.
CourierService: Coordinates the order process using payment and delivery.


**SOLID Principles Applied**

Single Responsibility Principle (SRP): Each class has one job, such as handling products, orders, or payments.

Open/Closed Principle (OCP): The Payment interface allows adding new payment methods without changing existing code.

Liskov Substitution Principle (LSP): Subtypes like ExpressDelivery and StandardDelivery can replace their base type Delivery.

Interface Segregation Principle (ISP): Interfaces like Payment and Review ensure classes implement only what they need.

Dependency Inversion Principle (DIP): CourierService depends on abstract interfaces (Payment and Delivery), not concrete classes.