import React, { Children } from 'react'

const Buttons = (props) => {
    const {Children}=props
  return (
    <button>{Children}</button>

  )
}

export default Buttons