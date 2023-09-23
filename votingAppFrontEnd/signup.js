let btn=document.getElementById("btn");
btn.onclick=()=>{
    regData();
}
  
 async function regData(){
    try{
        let regData={
            name:document.getElementById("name").value,   
            email:document.getElementById("email").value,          
            password:document.getElementById("password").value,  
            role:document.getElementById("role").value     
           
        }
        let res=await fetch('http://localhost:8080/adduser',{
            method:'POST',
            body:JSON.stringify(regData),
            headers:{
                'Content-Type':'application/json'
            }
            
        })
        let data=await res.json();
        console.log('data: ', data);
        // alert("User Added")
        // window.location.href="signin.html"

    }catch(error){
       console.log(error);
    }
 }