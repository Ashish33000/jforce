let btn=document.getElementById("btns");
btn.onclick=()=>{
    login();
}
  
 async function login(){
    
        let username = document.getElementById("username").value;
        let password = document.getElementById("password").value;
        let res=await fetch('http://localhost:8088/signIn',{
            method:'POST',
            body:JSON.stringify(loginData),
            headers:{
                'Authorization': 'Basic ' + btoa(username + ':' + password)
            }
            
        })
        let data=await res.json()
        console.log('data: ', data);
        if(res.status == 200 | res.status == 202){
            const token= response.headers.get("Authorization");
            console.log(token);
            localStorage.setItem("jwtToken", token);
            
    
            response.json().then(data => {
             
            localStorage.setItem("user", data.name);
    
            const url = "vote.html";
    
            location.href= url;
              
    
            });
      
        }
    
 
}