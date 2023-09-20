let btn=document.getElementById("btn");
btn.onclick=()=>{
    regData();
}
  
 async function regData(){
    try{
        let regData={
            username:document.getElementById("name").value,            
            password:document.getElementById("password").value,  
            phoneNo:document.getElementById("mobile").value     
           
        }
        let res=await fetch('http://localhost:8088/addUser',{
            method:'POST',
            body:JSON.stringify(regData),
            headers:{
                'Content-Type':'application/json'
            }
            
        })
        let data=await res.json()
        console.log('data: ', data);

    }catch(error){
       console.log(error);
    }
 }