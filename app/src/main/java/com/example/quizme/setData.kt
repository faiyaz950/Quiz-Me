package com.example.quizme

object setData {
    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuessData>{
       var que:ArrayList<QuessData> = arrayListOf()

       var ques1 = QuessData(
           1,
           "Android is -",
           "an operating system",
           "a web browser",
           "a web server",
           "None of the above",
           1
       )

       var ques2 = QuessData(
           2,
           "Which of the following virtual machine is used by the Android operating system?",
       "JVM",
       "Dalvik virtual machine",
       "Simple virtual machine",
       "None of the above",
           2
       )

       var ques3 = QuessData(
           3,
           "What does API stand for?",
           "Application Programming Interface",
           "Android Programming Interface",
           "Android Page Interface",
           "Application Page Interface",
           1
       )

       var ques4 = QuessData(
           4,
           "How can we stop the services in android?",
           "By using the stopSelf() and stopService() method",
           "By using the finish() method",
           "By using system.exit() method",
           "None of the above",
           1

       )
       var ques5 = QuessData(

           4,
           "What is an activity in android?",
       "android class",
       "android package",
       "A single screen in an application with supporting java code",
           "None of the above",
           3
       )
       que.add(ques1)
       que.add(ques2)
       que.add(ques3)
       que.add(ques4)
       que.add(ques5)
       return que
    }
}