<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Index</title>
</head>
<g:javascript library="jquery" plugin="jquery"/>
<script>
    $( document ).ready(function() {
        $.post('/command-binding/testBinding/testBinding', { fieldType: "String", fieldValue : "hello world"},
            function(returnedData){
                console.log(returnedData);
            });
    });
</script>
<body>
Index Page
</body>
</html>