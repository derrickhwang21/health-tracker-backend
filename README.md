# Codefellowship
Building an Android health tracker app. The features are built out over the next several labs.

This repository features server work for the project: [Health-Tracker Android Application](https://github.com/derrickhwang21/health-tracker)

## Feature Task

##### Backend
Add a replica of your Exercise model to the backend Spring app. Create a POST route that allows creating a new Exercise, and a GET route that responds with all Exercises currently in the database. Test these routes with Postman, deploy, and ensure there’s at least one Exercise in your deployed db. (This is all easy now… right?)



##### Camera Functionality

Add the ability for users to enter a profile picture. Give them the option of taking a new photo with the camera and/or using images already on their phone.

Home Page Without User Profile Image           |  Camera Activity
:-------------------------:|:-------------------------:
![sc-picture-home](screenshots/picture-home.png)  |  ![sc-picture-activity](screenshots/picture-activity.png)

User accessing external storage         |  Page With User Profile Image
:-------------------------:|:-------------------------:
![sc-picture-external-storage](screenshots/picture-external-storage.png)  |  ![sc-profile-image](screenshots/picture-profile-image.png)


## Changelog

01/25/2019

* Created Exercise mode, controller class, and repository interface.
* Mapped put and get routes.



#### Credits/Sources:

Volley Sources: https://developer.android.com/training/volley/simple,

Post Request(@Hasan A Yousef): https://stackoverflow.com/questions/33573803/how-to-send-a-post-request-using-volley-with-string-body

Get Request-JSON Array: https://android--examples.blogspot.com/2017/02/android-volley-json-array-request.html
