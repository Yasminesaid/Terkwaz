# First Task

	Class Taskpage_one

## First part of task1:
   ```bash
		Method searching()
				Navigate to "https://www.google.com/ncr"
				Search for "selenium webdriver"
				Check that the third result text contains "What is Selenium WebDriver?"
   ```
## Second part of task1:
   ```bash
		Method upload()
				Navigate to "https://the-internet.herokuapp.com/"
				Click on "File Upload"
				Upload any small image file
				Check that the file has been uploaded successfully
   ```
## Third part of task1:
   ```bash
		Method dynamic_loading()
				Navigate to "https://the-internet.herokuapp.com/"
				Click on "Dynamic Loading"
				Click on "Example 2"
				Click "Start"
				Wait for loading to finish
				Check that the text displayed is "Hello World!"
   ```

## Runing Steps
   ```bash
		Open Project TerkwazTask
		Open src/test/java
		Open class Tasktest_one.java
		Click Run as TestNG
   ```

	Note:
	image used is on PC with path D:/5.png

# Second Task

	Class Apinavigation
```bash
	Method Apipage()
		Navigate to "https://alexwohlbruck.github.io/cat-facts/"
		Use the relevant API endpoint to get one random cat fact
		Check that the response "text" is not empty
```

EndPoint Response


``` bash
       Get all cat facts "https://cat-fact.herokuapp.com/facts"
       Get one random fact
			"https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=1"

```
``` json
{"used":false,"source":"api","type":"cat","deleted":false,"_id":"591f97cc8dec2e14e3c20afe","__v":0,"text":"A form of AIDS exists in cats.","updatedAt":"2020-05-10T20:20:11.457Z","createdAt":"2018-01-04T01:10:54.673Z","status":{"verified":true,"sentCount":1},"user":"5a9ac18c7478810ea6c06381"}

```

## Runing Steps
		Open Project Apitask
		Open src/test/java
		Open class Testresponse.java
		Click Run as TestNG

# Technical Specs
	Selenium Webdriver
	RestAssured
	TestNG
	Maven
