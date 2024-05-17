# Lint Detector Lifecycle Issue

Android Lint stopped reusing `Detector` instances
and `beforeCheckRootProject`/`afterCheckRootProject` work incorrectly:

Running `./gradlew :app:lintDebug`, here is the output:

```
> Task :some-module:lintAnalyzeDebug
create instance: com.example.ldl.SampleDetector@5aebea84
beforeCheckRootProject: some-module (isMain=false)
beforeCheckEachProject: some-module (isMain=false)
afterCheckEachProject: some-module (isMain=false)
afterCheckRootProject: some-module (isMain=false)

> Task :app:lintAnalyzeDebug
create instance: com.example.ldl.SampleDetector@769f9d73
beforeCheckRootProject: app (isMain=false)
beforeCheckEachProject: app (isMain=false)
afterCheckEachProject: app (isMain=false)
afterCheckRootProject: app (isMain=false)

> Task :app:lintReportDebug
create instance: com.example.ldl.SampleDetector@671bd40
create instance: com.example.ldl.SampleDetector@59e5d413
```

According to `Detector` documentation, `beforeCheckRootProject` and `afterCheckRootProject` should
be called only once and only on `app` module, and the `Detector` instance should be reused.
