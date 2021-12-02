# PA Media Group - QA Engineer Technical Assessment

## About This Challenge

  * This challenge should take around 60 minutes to complete. Please do not spend more than 90 minutes at most.
  * We have provided bootstrapped projects for Engineers who wish to provide either a Java or JavaScript-based solution
  * We will accept submissions in other languages of choice
  * This assessment will be judged on your approach, the "how", "why" and "what" as well as simply the technical implementation
  * The README.md files for the Java and JavaScript versions of this assessment contain the same information described below, with additional links to the existing tests to refactor and "how to run" information.

When you have completed the challenge, please push your code into a GitHub repository and send the link back to us for review.

**⚠️ NOTE: A summary of the challenge is below, however please ensure you read the README for the version (Java or JavaScript/TypeScript) that you choose for complete instructions**

  - The Java challenge can be found [here](./java)
  - The JavaScript/TypeScript challenge can be found [here](./javascript)

## Challenge

### Scenario to Test

We would like you to implement tests for the following scenario:

`As a MetaWeather API client, I want to retrieve 'tomorrows' weather for "Nottingham"`

When you are writing your test please consider:
  
  - What kind of tests would you expect to see if you were testing this feature as part of a "production" release?
  - What kind of validation would you expect to find when testing a JSON and/or XML based API?
  - What if we needed to expand the test in future (e.g. to include different dates or locations)?

Documentation and API url are available here: [https://www.metaweather.com/api](https://www.metaweather.com/api)

### Refactoring

In the sample projects provided, we have included an existing test based around the same metaweather API.  This one test includes code that could be refactored to enable that code to be re-used in future scenarios.

We would like you to undertake that refactoring - making the changes you would make if you were responsible for maintaining this test suite, taking into consideration engineering best practices that you are aware of to make the appropriate changes.