
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

export function ViewBlogPost() {
    const [blog, setBlog] = useState([]);

    const params = useParams();
    

    useEffect(() => {
        fetch('/blogger/' + params.id)
            .then((response) => response.json())
            .then(setBlog)
    }, [params.id]);

    return (<div>
        
                
                  <div key={blog.id}>
                    <h3>{blog.name}</h3>
                       <h5>Publikuota: {blog.createdDate} </h5>
                        <p>{blog.contents}</p>
                        
                    
                 </div>
                 <button>Komentuoti</button>
                
    </div>);
}