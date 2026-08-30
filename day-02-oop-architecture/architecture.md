# Application Architecture

## Flow

Frontend -> REST API -> Backend -> Database -> Response

## Frontend

The user can enter customer details, service details and booking information
such as customer ID, service ID and booking date.

## REST API

The frontend can send the booking information to:

POST /api/bookings

## Backend

The backend validates the customer ID, service ID and booking details.
It also checks whether the required information is valid before saving the booking.

## Database

The database stores customer, service and booking information.
It can store details such as customer ID, service ID, booking ID, booking date and status.

## Response

After saving the booking, the backend sends a response to the frontend.
For example, it can return the booking ID and booking status.
The frontend can then show the booking confirmation to the user.