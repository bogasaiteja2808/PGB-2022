import "./index.css"
import { useHistory } from "react-router-dom"

const Home=()=>{
  const History=useHistory()
  const func=()=>{
  History.push("/Java");}

  const func1=()=>{
  History.push("/Python");}

  const func2=()=>{
    History.push("/JavaScript");
  }
  return(
        <div className="bg-container">
          <h1 className="home_head" align="center">Welcome,Test your programming abilities</h1>
            <div className="home_container">
                
                <img src="/images/javaimage.png" alt="javaimg" className="imgE1" onClick={func} path="/Java" />
                <img src="/images/py.png" alt="pythomimg" className="imgE" onClick={func1} path="/Python"/>
                <img src="/images/javaS.jpg" alt="javasriptimg" className="imgE" onClick={func2} path="/JavaScript"/>
            </div>
        </div>
    )
}

export default Home