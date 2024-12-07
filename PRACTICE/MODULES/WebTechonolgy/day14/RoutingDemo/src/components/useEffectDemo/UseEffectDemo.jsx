import React, { useEffect, useState } from "react";

const UseEffectDemo = () => {
  const [fname, setFname] = useState("");
  const [city, setCity] = useState("");
  const [places, setPlaces] = useState([]);

  const cityData = {
    Delhi: ["pitampura", "rohini", "Prashan vihar"],
    Mumbai: ["Navi Mumbai", "Dharavi", "Sea Link"],
    Nalanda: ["Bihar Sarif", "Nalanda", "Nagar Nausa"],
  };

  const handleCityChange = (e) => {
    setCity(e.target.value);
    setPlaces([]);
  };

  useEffect(() => {
    if (city) {
      console.log("before " + places);
      setPlaces(cityData[city] || []);
      console.log("after : " + places);
    }
  }, [city]);

  return (
    <div>
      <div>
        <form>
          <input
            type="text"
            name="fname"
            placeholder="First Name"
            value={fname}
            onChange={(e) => setFname(e.target.value)}
          />
          <select value={city} onChange={handleCityChange}>
            <option value="">Select City</option>
            <option value="Delhi">Delhi</option>
            <option value="Mumbai">Mumbai</option>
            <option value="Nalanda">Nalanda</option>
          </select>
          <select
            value={places}
            disabled={!city}
            onChange={(e) => setPlaces([e.target.value])}
          >
            <option value="">Places</option>
            {places.map((loc, index) => (
              <option key={index} value={loc}>
                {loc}
              </option>
            ))}
          </select>
        </form>
      </div>
    </div>
  );
};

export default UseEffectDemo;

{
  /* {places.map((loc, index) => (
  <option key={index} value={loc}>
  {loc}
  </option>
))} */
}
{
  /* <option value={places[0]}>{places[0]}</option>
<option value={places[1]}>{places[1]}</option>
<option value={places[2]}>{places[2]}</option> */
}
