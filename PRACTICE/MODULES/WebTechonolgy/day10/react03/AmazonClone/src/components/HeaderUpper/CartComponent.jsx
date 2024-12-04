import { faCartShopping } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

const CartComponent = () => {
	return (
		<div className="white-text d-flex pt-3">
			<div className="position-relative">
				<span className="badge">15</span>
			</div>
			<FontAwesomeIcon className="h" icon={faCartShopping} /> Cart
		</div>
	);
};

export default CartComponent;
