function showcourses(){
            fetch("http://localhost:8080/course")//API end point
            .then((response)=>response.json())
            .then((courses)=>{
                const dataTable=document.getElementById("coursetable")
                courses.forEach(course=>{
                    var row= `<tr>
                    <td>${course.courseId}</td>
                    <td>${course.courseName}</td>
                    <td>${course.trainer}</td>
                    <td>${course.durationInweeks}</td>
                    </tr>`

                    dataTable.innerHTML+=row;
                    
                })
            });
}

function showenrolledstudents(){
    fetch("http://localhost:8080/course/enrolled")//API end point
            .then((response)=>response.json())//HTTP response into json object
            .then((students)=>{
                const dataTable=document.getElementById("enrolledtable")
                students.forEach(student=>{
                    var row= `<tr>
                    <td>${student.name}</td>
                    <td>${student.emailId}</td>
                    <td>${student.courseName}</td>
                    </tr>`

                    dataTable.innerHTML+=row;
                    
                })
            });

}