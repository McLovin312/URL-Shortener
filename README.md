# Java URL Shortener

A simple command-line URL shortener built in Java. I created this project to practice core Java concepts and get more comfortable building a small application from start to finish.

The program allows users to create shortened URLs, look up the original URL, view saved URLs, and track how many times a shortened URL has been used.

## Features

* Create a shortened URL from a full URL
* Generate a random 6-character short code in the format `ABC123`
* Look up the original URL using its short code
* View all shortened URLs
* Track click counts
* Command-line menu for interacting with the application
* Input validation and handling of invalid menu selections
* Program continues running until the user chooses to exit

## What I Practiced

This project focuses on several Java fundamentals that are useful for building larger applications:

* **Classes and Objects**
* **Constructors**
* **Encapsulation**
* **Private fields and getters/setters**
* **Methods and method organization**
* **ArrayLists and Lists**
* **Loops and conditionals**
* **Switch statements**
* **User input with `Scanner`**
* **Random number and character generation**
* **String manipulation**
* **Basic object relationships**
* **Command-line application structure**

## Project Structure

```text
URL-Shortener/
├── Main.java
├── Options.java
├── Menu.java
├── ShortUrl.java
└── UrlGenerator.java
```

### `Main.java`

Serves as the entry point for the application and starts the user interaction.

### `Options.java`

Handles the main program loop and processes the user's menu selections.

### `Menu.java`

Contains the command-line menu displayed to the user.

### `ShortUrl.java`

Represents a shortened URL and stores information such as:

* Original URL
* Short code
* Click count

### `UrlGenerator.java`

Handles generating unique short codes for URLs.

## Example

```text
--- URL SHORTENER ---

1. Shorten URL
2. Find original URL
3. View all URLs
4. Exit

Select an option: 1

Enter URL to shorten: https://www.example.com

Short URL: ABC123
```

## Why I Built This

This is an entry-level project focused on applying Java fundamentals in a practical way rather than just working through isolated coding exercises.

The goal was to take concepts like classes, collections, loops, user input, and methods and combine them into a small application with an actual use case.

## Future Improvements

Some things I would like to add as I continue developing the project:

* Save URLs to a database
* Persist URLs between program runs
* Add expiration dates for shortened URLs
* Improve URL validation
* Add a web interface
* Create a REST API
* Add unit tests
* Prevent duplicate short codes
* Add analytics for individual shortened URLs

## Technologies

* Java
* Java Collections Framework
* Java `Scanner`
* Object-Oriented Programming
* Git / GitHub

## Status

**Completed as an entry-level Java project.**

I plan to revisit this project later and expand it into a more complete application with persistent storage and a web-based interface.
