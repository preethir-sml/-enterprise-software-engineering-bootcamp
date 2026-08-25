# Design Patterns Reflection

## Factory Pattern

The Factory Pattern is a creational design pattern used to create
objects without exposing the object creation logic to the main code.

In my example, PaymentFactory creates different payment implementations
such as StripePayment, PayPalPayment and RazorPayPayment.

The main program only asks the factory for a Payment object and does not
need to directly create the implementation.

### Real World Example

An e-commerce application can support multiple payment providers.
Depending on the selected payment method, the factory can create the
required payment implementation.

---

## Strategy Pattern

The Strategy Pattern allows different algorithms or behaviors to be
implemented separately and selected when required.

In my example, I created RegularPricing, MemberDiscount and
HolidayDiscount strategies.

Each strategy calculates the price differently, while PriceCalculator
can work with any PricingStrategy.

### Real World Example

An e-commerce application can have different pricing rules for regular
customers, members and holiday sales.

The pricing strategy can be changed without changing the main
PriceCalculator logic.

---

## Observer Pattern

The Observer Pattern allows multiple subscribers to be notified when
an event occurs.

In my example, OrderCreated is the event and EmailService,
AnalyticsService and NotificationService are subscribers.

When an order is created, OrderService notifies all subscribed services.

### Real World Example

In a restaurant application, when a customer places an order, multiple
services may need to react to the event.

The email service can send an order confirmation, the analytics service
can record the order and the notification service can notify the
customer.

This allows multiple services to respond to the same event without
putting all the logic into the order creation code.

---

## Comparison

| Pattern | Main Purpose | My Example |
|---|---|---|
| Factory | Object creation | Payment |
| Strategy | Changeable behavior | Pricing |
| Observer | Notify multiple subscribers | Restaurant order |

## Conclusion

Factory, Strategy and Observer solve different problems.

Factory manages object creation.

Strategy manages different algorithms or behaviors.

Observer manages communication between an event and multiple
subscribers.

These patterns help make software easier to extend, organize and
maintain.