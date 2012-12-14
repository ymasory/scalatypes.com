# scalatypes.com #

Currently deployed to [http://scalatypes.herokuapp.com/](http://scalatypes.herokuapp.com/).

[![Build Status](https://ymasory.ci.cloudbees.com/job/ymasory%20scalatypes.com/badge/icon)](https://ymasory.ci.cloudbees.com/job/scalatypes.com/)

## Build & run locally ##

```sh
$ cd scalatypes.com
$ ./sbt
> container:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Deploy to production (Heroku) ##

```sh
$ git status # make sure everything is committed!
$ git remote add heroku git@heroku.com:scalatypes.git
$ git push origin heroku
```
