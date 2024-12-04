import { faAmazon } from "@fortawesome/free-brands-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import "../../style/HeaderUpper/header.css";
const LogoComponent = () => {
	return (
		<div className="px-3 white-text">
			<FontAwesomeIcon id="logo-amazon" icon={faAmazon} />
		</div>
	);
};

export default LogoComponent;
