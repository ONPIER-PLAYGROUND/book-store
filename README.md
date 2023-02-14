# book-store
Book store as a service that aggregates multiple book provider and provides an API to list the books and order
a book.

## Requirements on the service
- For the simplicity, we don't consider any payment for a book. Users can order a book without a need to pay for it.
- We also assume that every book provider will provide the same api defined by us.
- We have a dummy implementation of provider API to get the data. 
- You can assume a REST communication behind the provider API for our model situation.
- As a service provider, we want to get a commission from the book provider.
  - Register a commission only if the order is successful
  - We want to be able to send a monthly overview of generated commissions to every provider 
- Commissions:
  - for travel books - 10% of the price
  - for fantasy books - 4% of the price
  - for adventure books - 4% of the price
  - 

## TODO for the applicant
- Consider a situation where the service was developed by one of a new junior dev who has not many experiences with design and best practices
- Do a refactoring of the application fo that it:
  - follows common best practices
  - extension for the future development can be done easily
  - requirements are fulfilled
  - code standard including naming and documentation is done 
  - write a couple of unit tests (no need to cover all, just show how you usually proceed with testing)