# jest-integration-template

## Overview

This template is based on the esport-integration-test framework.
It can be used to scaffold an out of the box Jest integration test project.

## Setup

Include instructions for running any required external projects (e.g. a test stack) that you might need here. The line below is an example from the skybet-rdm-integration-tests.

Before running this project, you'll need to have the [skybet-rdm-test-stack](https://github.com/pa-media-group/skybet-rdm-test-stack)
running locally. See instructions on how to run the skybet-rdm-test-stack [here](https://github.com/pa-media-group/skybet-rdm-test-stack#starting-the-stack-1).

## Installation

You need node.js installed to run the service. It is recommended that you use nvm for managing the complexity of Node versions. Using nvm, run:

    nvm use

This will select the appropriate version of Node installed on your machine upon the .nvmrc file.

To install the dependencies:

    npm ci

## Structure

### resources

Test data and any other resources needed by tests that are not support utilities.
`users.json` holds an example user for the reqres.in API.

### support

Code that supports tests and can be reused across multiple tests.
`http-requests.ts` is a helper that wraps HTTP calls, sending an optional JWT for authentication.
TODO: We are intending to take the HTTP helper, extend it and split it off into a library.

### test

Jest tests to be executed.
`rest-example.ts` contains two example tests that assert against the reqres.in API.

One example is a singular call test, and one is a data-driven test calling the same endpoint with multiple inputs.

## Available NPM scripts

Right-click on the package.json file in the Project pane.

Select 'show npm Scripts' in the popup.

This will display an npm tab in the left sidebar, and an npm panel underneath the Project panel.

The items are:

- `format` - Runs `prettier` on the readme and all the typescript files in the test or support directories.
- `lint:all` - Executes code checks for both code and package using tslint and npmPkgJsonLint respectively.
- `lint:code` - Executes code checks on code using tslint.
- `lint:package` - Executes code checks on [package.json] using npmPkgJsonLint
- `test` - Executes jest tests.

## Using the template

Use GitHub template when starting a new test project.
Make sure to update the base url configuration, that can be found in `/support/config/test-config.ts`.

Tests can be executed by running `npm test`.

Tests will be executed in the `test` directory or one level of sub-directory provided they end in `.ts`, `.tsx` or `.js`.
This template has been set up to use `--runInBand` - this will prevent tests from running multiple suites at the same time, if this is something you do not need then please remove this flag in the package.json
This default behaviour can be configured in `jest.config.js`.

## Contributing to the template

Feel free to contribute enhancements to the template, make a branch and create a PR in the normal way.
