import React from "react";
import PropTypes from "prop-types";

export default function InputField({ value, onChange, type, placeholder }) {
  return (
    <div className="mb-4">
      <input
        type={type}
        className="text-black border-2 rounded-md p-2 w-full"
        value={value}
        onChange={onChange}
        placeholder={placeholder}
      />
    </div>
  );
}

InputField.propTypes = {
  value: PropTypes.oneOfType([PropTypes.string, PropTypes.number]).isRequired,
  onChange: PropTypes.func.isRequired,
  type: PropTypes.string.isRequired,
  placeholder: PropTypes.string.isRequired,
};
