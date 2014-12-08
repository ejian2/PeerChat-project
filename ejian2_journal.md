November 3-9: I completed the setup of the Android environment with Eclipse. I also installed the NDK tools to be able to do NDK development.  I had a little bit of trouble understanding how the NDK tools work. I will run the samples provided to see how NDK works. I also plan on going through all of the Android SDK tutorials on the android website to get an understanding of Android development.  So far the only problems I have ran into were confusion on how to setup the Android environment with the NDK tools. I followed the steps provided on the piazza post for the setup.  It cleared things up and everything is all setup in terms of environment. I had a project idea of creating a mobile cloud file system, but I am not sure if I will be able to complete it with the limited time given.  I am currently thinking about different project ideas that I could make instead.     

November 10-16: I got my eclipse to be able to deploy my sample android app to my phone. I also got all the NDK sample apps to work as well.  I found hello JNI to be the most helpful out of all of them.  I will be studying the code and playing with it to see how I can apply it to my project.  I have decided on my project which will be a peer-to-peer chat.  I am thinking about using a TCP server.  I am still unclear about how the server would work but I will be created a simple Java side interface for the app in the meantime.  At the Hackathon, I created the Java side interface of the app so it currently takes in an IP address, a port number, and writes a message.  I created three buttons: start, stop, and send.  Start would start the chat server so others will be able to talk to the phone.  Stop would stop the server so no other people can continue talking back.  Send will send out the message to the other phone. These buttons call the functions in the JNI part and they will perform the required actions.  I ran into some issues such as the text view for the messages would be cleared when the send button was pressed.  I later found out the bug was happening in my send button postexec function, where I was clearing the text view.  

November 17-23:  I decided to split up the app into two separate apps, one for the server and one for the client.  I ran into issues with just using a server app with two sockets, and the messages were not being delivered correctly.  This alteration makes the app work each sending their own respective messages to one another.  The client's start button is different from the server.  I implemented it so when the client clicks the start button, the client's socket will be open and the server (who is waiting to accept a connection) will be able to make a connection.  Other small things were added on like the way the messages are printed out.  I made it so you can review all of the messages sent out when these two apps made a connection. 

November 24-30: Thanksgiving break.  I looked over the code to see if there were any other additional features that could be added.  I added a nickname text field so users can input their name so it would display who is saying what message.  I also changed some of the button setting so when you start the server, the start button would not be able to be pressed again.  I created the video of the application running.  I recorded two android phones that were able to talk to one another.   

December 1-7:  I just used this week to make some final tweaks and to debug so the app would be able to run smoothly. 

Problems: I found that writing C/C++ code in android application is not very simple.  At times, things got very confusing and I had to spend copious amounts of time looking for really small bugs.  It was particularly difficult because debugging of NDK applications is not straightforward.  It took me a lot of time to be able to debug successfully and find the problem.  There are a lot of different files you need to keep track of such as if you want to change something in the interface of the application there are specific sections where you need to add code to make everything work correctly.
