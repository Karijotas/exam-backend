import { useState } from "react";
import './CreateBlogPost.css';


export function CreateBlogPostPage() {

    const [name, setName] = useState("");
    const [summary, setSummary] = useState("");
    const [contents, setContents] = useState("");

    const clear = () => {
        setName("");
        setSummary("");
        setContents("");
    }

    const applyResult = (result) => {
        if (result.ok) {
            clear();
        } else {
            window.alert("Nepavyko sukurt: " + result.status);
        }
    };


    const createBlogPost = () => {
        fetch(
            '/blogger/', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    name,
                    summary,
                    contents,
                
                })
        }).then(applyResult)
        
    };

    return(<div className="Create">
        <h2>Create</h2>
        <form>
        <label>
          Name:
          <input type="text" name="name" />
        </label>
        <label >Summary:

        </label>
        <label >Text: 

        </label>
        <input type="submit" value="Submit" />
      </form>

    </div>)
}
