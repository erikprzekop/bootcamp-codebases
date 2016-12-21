Portfolio Manager
-----------------
This is intended to practice creating test doubles and mocking frameworks.  This codebase should be test-driven from scratch, based on the following instructions:

- Create a Portfolio that will hold a collection of stocks
- Each stock is composed of a ticker symbol and the number of shares (note that this does NOT mean you must create a Stock class, though you can if that fits your design).
- Once you have a portfolio and can get the number of shares for a given ticker symbol, add a test double (i.e., don't use a framework) so that the Portfolio can return the current share price for a stock.
- Re-do this to use a mocking framework (mockito is usually preferred)
- Calculate the current value of the entire portfolio

The point of this is to manually create a mock, then use a framework.  This demonstrates what the framework is doing for you, and shows how it works behind the scenes.
