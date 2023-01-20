import { Link } from "react-router-dom";

export function Menu() {
    return (<div className="Menu">
        <Link to='/blogger'>Front Page</Link>
        &nbsp;|&nbsp;
        <Link to='/blogger/create'>Create</Link>

            </div>);
}
