# Continuous Assessment 1 - Dorset College 
- Module Title: Mobile App 1
- Lecture name: Saravanabalagi Ramachandran

## About Me App
- Student Name: Josue Dilmo dos Santos
- Student Number: 24061

## Basic Details:
- Full name
- Email
- Photo
- Short intro about you
- 4 buttons that link to 4 additional activities for education, skills, hobbies, achievements respectively
- Exit button **(Hint: You need to finish the activity when this button is clicked)**
- Small gray text with copyright and built with info in 2 separate lines at the end **(E.g. © Copyright John Doe 2022, Built with Android Studio)**.

## Each button link should open a new activity that contains:
- Top row (title bar) should have a vector icon and title of the activity **(e.g. mortarboard icon followed by the title "Education")**.
- Relevant details in multiple text views.
- images related to the details presented e.g. your school logo, image of your school, etc. (At least one image should be present)
- at the bottom, a row containing three buttons (or two buttons) as explained below should be present:
    - Back button with text same as previous activity's name, should not be present in first of the four extra activities
    - Home icon (no text)
    - Next button with text same as next activity's name, should not be present in last of the four extra activities
    - e.g. 1, for hobbies (middle) activity, there are 3 buttons: skills, home icon and achievements
    - e.g. 2, for achievements (last) activity, there are only 2 buttons: hobbies and home icon
- Same small copyright text present in Main Activity
- In the skills page, mention Android Studio, display this SVG icon. (Hint: You need to import this as a vector asset and a new XML file will be created).
- Make your layouts scrollable. (Hint: Wrap required layouts inside ScrollView)
- Feel free to add additional information (such as languages known, interests, goals, volunteering experiences, etc.) and additional assets (such as images and icons) to make the app lively and complete. You are allowed to make changes to text elements e.g. change title "Education" to "Educational Requirements".

## Requirements Checklist:
1. - [x] Main Activity (or Launcher Activity)
2. - [x] Button Links open new Activity
3. - [x] Home icon opens Main Activity from back-stack instead of creating newly
4. - [ ] Exit Button finishes the activity and closes the app
5. - [x] Text is not hardcoded in the layout but is present in "strings" resources xml file
### Image Assets:
1. - [ ] Images (Raster) are used
2. - [ ] Vector icons (inbuilt material icons) are used
3. - [ ] SVG icon is used
### Layout and Design:
1. - [x] All text presented should be clear and legible and should have sufficient contrast (Hint: Dark Gray Text on Dark Blue background is bad)
2. - [ ] All activities should contain ScrollViews to display lengthy content
### In Main Activity: 
1. - [x] Basic details are centered horizontally
2. - [x] Photo has at least 5dp margin on all sides
3. - [x] 4 buttons have same length
### Copyright Text: 
1. - [x] has a small font size
2. - [x] has dark gray color
3. - [ ] has a top padding 10dp with a top gray border of 1dp (to separate it out from the main content)
### In all 4 extra activities: 
1. - [ ] title row is at the top of the app and does not scroll
2. - [ ] title row has a dark background (and hence white/light colored text and icon)
3. - [ ] button row is at the bottom of the app and does not scroll
4. - [ ] button row has 3 buttons (or 2 buttons) are present in one row with at least 5dp space in between them
5. - [ ] button row spans full width of the app (i.e. each button's width will be set based on app's width)
6. - [ ] icon and title are displayed on top and in one row horizontally centered. Contents inside this row should be vertically aligned in the centre (while the row itself is at the top of the page)
### Coding Practices (Hint: Check online if you don't know what the right/best practice is):
1. - [ ] Variable and File Naming conventions are followed
2. - [ ] Code is properly indented
3. - [ ] Right File Structure is followed (e.g. Layout xml files placed directly under resources directory is bad, place it in "layout" folder instead)
### Hard:
1. - [ ] Use at least one FrameLayout as a separator e.g. to separate two LinearLayouts or TextViews (Hint: Set height 1dp with a light gray background)
2. - [ ] Show both icons and text in buttons (except home icon)
3. - [x] Make ImageView display your photo with rounded corners (without editing your photo)
