# book-store
Book store is a service that aggregates multiple books providers and gives an API to list the books and make an order of a book.
In our model situation, we always have a provider that specializes on one genre. Therefor we always have one provider per genre.

## Requirements on the service
- For the simplicity, we don't consider any payment for a book. Users can order a book without a need to pay for it.
- We assume that every book provider will provide the same api (as defined in this app).
- We have a dummy implementation of provider API to get the data. 
- You can assume a REST communication behind the provider's API for our model situation.
- The service should be able to run as a high traffic application.
- As a service provider, we want to get a commission from the book provider.
  - Register a commission only if the order is successful
  - We want to be able to send a monthly overview of generated commissions to every provider 
- Commissions:
  - for travel books - 10% of the price
  - for fantasy books - 4% of the price
  - for adventure books - 4% of the price

## TODO for the applicant
- Consider a situation where the service was developed by one of a junior devs who has not many experiences with design and best practices
- Do the refactoring of the application so that:
  - clean code pattern and best practices are followed
  - extension for the future development can be done easily
  - defined requirements are fulfilled
  - feel free to create new classes or rename/remove existing classes or package structure
  - write a couple of unit tests (no need to cover all, just to show how you usually proceed with testing)
- Don't take more than 3 hours for the task. Prioritize the tasks well!