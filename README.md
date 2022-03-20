Recipe App

Overview

An app for creating and managing recipes. Users can create their own recipes from scratch or add a ready made one from the public cookbook. Every user has their own cookbook which acts their personalised recipe library.


Use Cases

Actors

- User
- Admin

User

- Add recipe
- Create new recipe
- Remove recipe
- Edit recipe
- Search for recipe
- Login/Register

Admin

- Add new user
- Remove user
- Edit user
- Search for user
- Add new recipe to public library
- Remove recipe from public library
- Edit recipe in public library
- Search for recipe in public library
- Login



Functional Requirements

Critical

1. As a user, I want to be able to add a recipe to my cookbook such that I have more recipes.
2. As a user, I want to be able to create a custom recipe such that I can have my own recipes in my cookbook.
3. As a user, I want to be able to edit a recipe in my cookbook such that I can keep it up to date.
4. As a user I want to be able to manage the recipes in my cookbook such that I have better control of its contents.


High

5. As a user I want to be able to login to my account such that I can view my own personal cookbook.
6. As a user, I want to have a public recipe library such that I can add its recipes to my cookbook.
7. As a user, I want to be able to categorise the recipes in my cookbook.

Low

8. As a user, I want to have a checklist for the recipe’s methods such that I can better track my progress.
9. As a user, I want to be able to pin my favourite recipes such that I can find them more easily in the future.


Entities

- User
- Admin
- Recipe
- Ingredient 
- Cookbook

Entity Relationships

- A user has a cookbook
- A cookbook belongs to a user
- A cookbook has many recipes
- A recipe has many ingredients 




